from glob import glob
import subprocess as sp
from bs4 import BeautifulSoup as bs
import requests
import os
import sys

def printError(tmp):
    print('[ERROR]: ',tmp)

path = sys.stdin.readline().strip().split(' ')[1]
language = path.split('.')[-1]
check_all = True

if language not in [ 'py', 'js', 'java']:
    check_all = False

if not check_all:
    printError('지원하는 언어가 아닙니다.')
    exit(0)

data = list()
with open(path, 'r') as f:
    data = f.readlines()
printError(data)
user_name = ''
link      = ''
HASH      = 0

for line in data:
    after_strip = line.strip()
    if "Authored by" in after_strip:
        user_name = after_strip.split(':')[-1].strip()
    if "Link" in after_strip:
        link      = after_strip.split(':')[-1].strip()
        HASH      = link.split('/')[-1]

if user_name == '' or link == '' or HASH == 0:
    check_all = False

if not check_all:
    printError('주석 입력 양식에 어긋납니다. 주석을 수정해주세요.')
    exit(0)

# check Link
url  = f"https://www.acmicpc.net/source/share/{HASH}"
req  = requests.get(url).text
html = bs(req, 'html.parser')
boj_user = html.select('body > div.wrapper > div.breadcrumbs > div > ul > li > a')[0].text
result   = html.select('body > div.wrapper > div.container.content > div > section > div:nth-child(3) > div > table > tbody > tr > td:nth-child(1) > span')[0].text
memory   = html.select('body > div.wrapper > div.container.content > div > section > div:nth-child(3) > div > table > tbody > tr > td:nth-child(2)')[0].text + " KB"
time     = html.select('body > div.wrapper > div.container.content > div > section > div:nth-child(3) > div > table > tbody > tr > td:nth-child(3)')[0].text + " ms"

if result != "맞았습니다!!":
    check_all = False

if not check_all:
    printError('문제가 틀렸습니다')
    exit(0)

problemID = path.split('/')[-2]
tag       = path.split('/')[-3]
print("SUCCESS")
print(f"솔루션 경로 : {path}")
print(f"BOJ USER : {boj_user}")
print(f"Result : [Success!]")
print(f"Memory : {memory}")
print(f"Time : {time}")
print(f"Tag : {tag}")
print(f"Ploblem URL : https://www.acmicpc.net/problem/{problemID}")
