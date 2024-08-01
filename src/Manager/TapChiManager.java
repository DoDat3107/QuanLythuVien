package Manager;

import module.Bao;
import module.Tapchi;

import java.util.ArrayList;

public class TapChiManager implements IManager<Tapchi>{
    private ArrayList<Tapchi> list = new ArrayList<>();
    @Override
    public void add(Tapchi tapchi) {
        this.list.add(tapchi);
    }

    @Override
    public void remove(int id) {
        int index = FindById(id);
        list.remove(index);
    }

    @Override
    public void update(int id, Tapchi tapchi) {
        int index = FindById(id);
        list.set(index, tapchi);
    }



    @Override
    public int FindById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdTapChi() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Tapchi> FindAll() {
        return this.list;
    }
}
