package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;


public class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<N;i++)
        {
            A[i] = Integer.parseInt(inp[i]);
        }
        int out_ = solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int N,int[] A){
    	TreeSet<Integer> ts = new TreeSet<>();
    	for (int i = 0; i < N; i++) {
    		ts.add(A[i]);
		}
    	int max = ts.last();
    	int min = ts.first();

    	if(Math.abs(min)>=max)
		return min;

    	return max;
        // Your code goes here
    }
}