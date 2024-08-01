package Manager;

import module.Bao;

import java.util.ArrayList;

public class BaoManager implements IManager<Bao> {
    private ArrayList<Bao> list = new ArrayList<>();
    @Override
    public void add(Bao bao) {
        this.list.add(bao);
    }

    @Override
    public void remove(int id) {
        int index = FindById(id);
        list.remove(index);
    }

    @Override
    public void update(int id, Bao bao) {
        int index = FindById(id);
        list.set(index, bao);
    }

    @Override
    public int FindById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBao() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Bao> FindAll() {
        return this.list;
    }
}
