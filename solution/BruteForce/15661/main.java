// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/3ee3d9284f2e4fd7b92b2a22e17d02d6



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/71ea4f3e32e142f5ab5357ae22e0f12b

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main 
{
    static int N;
    static int [][] graph;
    static int min = Integer.MAX_VALUE;
    static boolean [] visited;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        //1. ds
        graph = new int[N][N];
        visited = new boolean[N];
        //1. ds
        for(int i=0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
            {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(graph));
        dfs(0);
        System.out.println(min);
    }
    public static void dfs(int depth)
    {
        if(depth == N)
        {
            checkTeam();
            return;
        }
        visited[depth] = true;
        dfs(depth+1);
        visited[depth] = false;
        dfs(depth+1);
    }
    public static void checkTeam()
    {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (visited[i] != visited[j])
                    continue;
                if (visited[i])
                    start += graph[i][j] + graph[j][i];
                else
                    link += graph[i][j] + graph[j][i];
            }
        }
        min = Math.min(min,Math.abs(start-link));
    }

    public static void print(boolean [] tmp)
    {
        for(int j=0;j<N;j++)
        {
           System.out.print(tmp[j]+" ");
        }
        System.out.println();
    }
}
