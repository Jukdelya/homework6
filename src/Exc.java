public class Exc {
    public void Ri(){
            try {
        int[] Numbers = {1, 2, 3};
        System.out.println(Numbers[1]);
        System.out.println(Numbers[4]);
    } catch (Exception e) {
                System.err.println("Ошибка");
            }
    }
}

