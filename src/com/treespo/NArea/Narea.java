package com.treespo.NArea;

import com.treespo.Definicoes;

public class Narea implements Definicoes {

    public NodeNArea root;

    public Narea (){
        root = null;
    }

    public NodeNArea getRoot(){
        return root;
    }

    public void insert (int info){
        NodeNArea posNo, ant=null;
        int pos = 0;
        boolean flag = false;
        if(root == null){
            root = new NodeNArea(info);
        }
        else {
            posNo = root;
            while(posNo != null && !flag) {
                pos = posNo.findPos(info); // posicao que achou

                if(posNo.getTl() < N-1){
                    posNo.spread(pos); // eh a posicao que remanejou
                    posNo.setvInfo(pos,info); // e tambem eh a posicao que ira inserir
                    posNo.setTl(posNo.getTl()+1);
                    flag = true;
                }
                else {
                    ant = posNo;
                    posNo = posNo.getvLig(pos);
                }
            }
            if (!flag)
                    ant.setvLig(pos, new NodeNArea(info));
        }
    }

    public void inOrdem (NodeNArea root){
        if(root != null){
            for (int i =0; i< root.getTl(); i++){
                inOrdem(root.getvLig(i));
                System.out.println(root.getvInfo(i));
            }
        }
    }
}
