package generic.test.ex2;

public class Pair<F,S> {
    private F first;
    private S second;

    public void setFirst(F first){
        this.first = first;
    }
    public void setSecond(S second){
        this.second = second;
    }
    public F getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }

    @Override
    public String toString(){
        return "pair1 = Pair{first="+first+", second="+second+"}";
    }
}
