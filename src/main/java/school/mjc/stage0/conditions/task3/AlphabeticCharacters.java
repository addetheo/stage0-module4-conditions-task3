package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        boolean vowel = false;
        if (character > 123 || character < 64) {
            System.out.println("wrong alphabet!");
        } else{
            char vowels[] = {'a', 'e', 'i', 'o', 'u'};
            for (int i = 0; i < vowels.length; i++){
                if(Character.toLowerCase(character) == vowels[i]){
                    vowel = true;
                    System.out.println("Vowel");
                }
            }
            if(!vowel){
                System.out.println("Consonant");
            }
        }
    }
}

