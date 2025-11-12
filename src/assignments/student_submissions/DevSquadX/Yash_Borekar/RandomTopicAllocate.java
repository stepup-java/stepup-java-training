package assignments.student_submissions.DevSquadX.Yash_Borekar;

import java.util.Arrays;

public class RandomTopicAllocate {
    static void main() {
        String[] teamName = {"DevSquadX", "404 Not Found", "CodeCrafters", "buglife2.0", "core 8", "Full Stack Ninjas", "TechOrbit"};
        String[] topicName = {"Classes & Objects", "Abstraction", "Polymorphism", "Inhertiance", "Encapsulation", "Java Keywords", "Access Modifiers"};

        String [] randomPair = new String[2];
        randomPair = getRandomPair(teamName,topicName);
        System.out.println(Arrays.toString(randomPair));



    }

    public static String[] getRandomPair(String[] teamName, String[] topicName) {
        String teamN = teamName[(int)(Math.random()*teamName.length)];
        String topicN = topicName[(int)(Math.random()*teamName.length)];
        return new String[]{teamN, topicN};
    }
}