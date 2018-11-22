//Eager approach
class QuickFind {

    private int [] id;
    // initialize  arr by id like 0 1 2 3 4
    QuickFind(int N){
        id = new int [N];
        for(int i = 0; i< N; i++){
            id[i]=i;
        }
    }


    boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i =0; i<id.length; i++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }
    void print(){
        for (int x : id){
            System.out.println(x);
        }
    }
}
