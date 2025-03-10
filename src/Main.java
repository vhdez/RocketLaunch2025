public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to today's rocket launch!");
        launchRecursively(15);
        System.out.println("Rocket 1 has launched");
        launchRecursively(5);
        System.out.println("Rocket 2 has launched");
    }

    public static void launchRecursively(int launchTime) throws Exception{
        if (launchTime == 0) {
            // there is nothing to do
            return;
        } else {
            Thread.sleep(1000);
            System.out.println("The rocket will launch in " + launchTime + " seconds.");
            launchRecursively(launchTime -1);
        }
    }

    public static void launchIteratively(int launchTime) throws Exception {
        for (int seconds = launchTime; seconds > -1; seconds = seconds - 1) {
            Thread.sleep(1000);
            System.out.println("The rocket will launch in " + seconds + " seconds.");
        }
    }
}