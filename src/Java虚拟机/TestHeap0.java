package Java虚拟机;

public class TestHeap0 {
    public static void main(String[] args) {
        byte[] b = null;
        for (int i = 0; i < 10 ; i ++){
            b = new byte[1024*1024];
        }
    }
}
