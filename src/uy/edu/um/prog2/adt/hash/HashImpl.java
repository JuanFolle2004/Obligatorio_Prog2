package uy.edu.um.prog2.adt.hash;

import uy.edu.um.prog2.adt.Exceptions.InformacionInvalida;
import uy.edu.um.prog2.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.prog2.adt.linkedlist.MyList;

public class HashImpl<K,T> implements Hash<K,T> {
    private HashNode<K,T>[] grilla;
    public int size;

    public HashImpl(int size) {
        this.size = size;
        this.grilla = null;
    }

    @Override
    public void insert(K key, T data) throws InformacionInvalida {
        HashNode<K,T> nuevo = new HashNode<>(key,data);
        int codigo = key.hashCode();
        int marcador = codigo % size;
        int num = size;
        while (grilla[marcador] != null && num >= 0) {
            marcador = (marcador + 1) % size;
            num--;
        }
        if (num == 0) {
            throw new InformacionInvalida();
        }
        grilla[marcador] = nuevo;
    }

    @Override
    public void delete(K key, T data) throws InformacionInvalida {
        HashNode<K,T> nodo = new HashNode<>(key,data);
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (grilla[i].equals(nodo)) {
                a = i;
            }
        }
        if (a != 0) {
            grilla[a] = null;
        } else {
            throw new InformacionInvalida();
        }
    }

    @Override
    public int search(K key, T data) {

        return 0;
    }
}
