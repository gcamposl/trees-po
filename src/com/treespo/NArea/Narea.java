package com.treespo.NArea;

public class Narea implements Definicoes{

    public No root;

    public Narea (){
        root = null;
    }

    public No getRoot(){
        return root;
    }

    public void insert (int info){
        No posNo, ant=null;
        int pos = 0;
        boolean flag = false;
        if(root == null){
            root = new No(info);
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
                    ant.setvLig(pos, new No(info));
        }
    }

    public void inOrdem (No root){
        if(root != null){
            for (int i =0; i< root.getTl(); i++){
                inOrdem(root.getvLig(i));
                System.out.println(root.getvInfo(i));
            }
        }
    }
}
