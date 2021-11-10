package com.treespo;

import com.treespo.NArea.Narea;

public class Main {

    public static void main(String[] args) {
        Narea tree = new Narea();
        tree.insert(100);
        tree.insert(90);
        tree.insert(130);
        tree.insert(30);
        tree.insert(49);
        tree.insert(70);
        tree.insert(94);

        tree.inOrdem(tree.getRoot());
    }
}
