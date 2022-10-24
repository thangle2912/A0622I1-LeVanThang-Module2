package src.ss15_exception_debug.bai_tap;

public class IllegalTriangleException {
    int canhA, canhB, canhC;

    public IllegalTriangleException(int canhA, int canhB, int canhC) throws Exception{
        if (canhA <=0 || canhB <=0 ||canhC <=0 || canhA + canhB <= canhC || canhA + canhC <= canhB || canhB + canhC <= canhA ){
            throw  new Exception();
        }
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
}
