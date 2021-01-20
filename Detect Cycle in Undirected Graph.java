package com.company;

import java.util.ArrayList;

class Detect_cycle_in_undirected_graph
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                if(isDFS(adj,i,visited,-1))
                    return true;
            }
        }
        return false;
        // Code here
    }

    public boolean isDFS(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],int parent )
    {
        visited[src]=true;
        for(int V :adj.get(src))
        {
            if(!visited[V])
            {
                if(isDFS(adj,V,visited,src))
                {
                    return true;
                }
            }
            else if(V!=parent)
            {
                return true;
            }

        }
        return false;
    }
}