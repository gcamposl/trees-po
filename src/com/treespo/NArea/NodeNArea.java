package com.treespo.NArea;

import com.treespo.Definicoes;

public class NodeNArea implements Definicoes {
    private int vInfo[];
    private NodeNArea vLig[];
    private int tl;

    public NodeNArea(){
        vInfo = new int [N-1];
        vLig = new NodeNArea[N];
        tl = 0;
    }

    public NodeNArea(int info){
        this(); // chama outro construtor, no caso, o de cima
        vInfo[0] = info;
        tl = 1;
    }

    public int getvInfo(int pos) {
        return vInfo[pos];
    }

    public void setvInfo(int pos, int info) {
        vInfo[pos] = info;
    }

    public NodeNArea getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, NodeNArea lig) {
        vLig[pos] = lig;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int findPos(int info){
        int pos =0;
        while (pos < tl && info > vInfo[pos])
            pos++;
        return pos;
    }

    public void spread (int pos){
        for(int i = tl; i>pos; i--)
            vInfo[i] = vInfo[i-1];
    }
}
