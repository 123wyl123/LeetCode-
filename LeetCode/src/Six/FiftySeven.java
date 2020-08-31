package Six;

public class FiftySeven {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.isEmpty()){
            return true;
        }
        int[] map = new int[4];
        for(char c : moves.toCharArray()){
            map[c - 'A']++;
        }
        return map['U'- 'A'] == map['D'- 'A']
                && map['L'- 'A'] == map['R'- 'A'];
    }
}
