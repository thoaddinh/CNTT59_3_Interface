package CNTT59_Interface;

public class CasioCalculator implements ICalculator{

    @Override
    public int cong(int s1, int s2) {
            return s1 + s2;
    }

    @Override
    public int tru(int s1, int s2) {
        return s1 - s2;
    }

    @Override
    public int nhan(int s1, int s2) {
        return s1*s2;
    }

    @Override
    public float chia(int s1, int s2) {
      if(s2 != 0)
          return s1 / s2;
        return 0;
    }
    
}
