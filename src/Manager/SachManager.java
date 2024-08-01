package Manager;


import module.Sach;

import java.util.ArrayList;


public class SachManager implements IManager<Sach>{
    private ArrayList<Sach> list = new ArrayList<>();

    @Override
    public void add(Sach sach) {
        this.list.add(sach);
    }

    @Override
    public void remove(int id) {
        int index = FindById(id);
        list.remove(index);
    }

    @Override
    public void update(int id, Sach sach) {
        int index = FindById(id);
        list.set(index, sach);
    }

    @Override
    public int FindById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdSach() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Sach> FindAll() {
        return this.list;
    }
}
