package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;



class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int [N];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<N;i++)
        {
            A[i] = Integer.parseInt(inp[i]);
        }
        int Q = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<Q;i++) {
            String[] inp1 = br.readLine().split(" ");
            int L = Integer.parseInt(inp1[0]);
            int R = Integer.parseInt(inp1[1]);
            int out_ = solve(N, A, L ,R);
            System.out.println(out_);
        }
	    wr.close();
        br.close();
    }
    static int solve(int N, int[] A, int L, int R) {

    	int subArray[] = Arrays.copyOfRange(A, L-1, R);

    	for (int i : subArray) {
			System.out.print(i + " ");
		}
    	System.out.println();

    	int l = subArray.length;
//    	System.out.println("length" + l);
    	Arrays.sort(subArray);

    	System.out.println("Sorted array");
    	for (int i : subArray) {
			System.out.print(i + " ");
		}
    	System.out.println();

    	if(l==1) {
    		return subArray[0];
    	}
    	else
    		if(l%2!=0)
        {
//    		System.out.println(l/2);
            return subArray[l/2];
        }
        return subArray[l/2-1];
    }
}

//Inputss
/*
6
2 4 5 3 1 6
3
1 6
2 4
3 3
*/