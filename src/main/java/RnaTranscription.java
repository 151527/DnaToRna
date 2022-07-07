import java.util.stream.Collectors;
import java.util.*;
public class RnaTranscription {
    static HashMap dnaToRna=new HashMap(){{
        put('G','C');
        put('C','G');
        put('T','A');
        put('A','U');
    }};
    public String transcribe(String dnaStrand){
        StringBuilder retVal = new StringBuilder();
        for( int i = 0; i < dnaStrand.length(); i++ ){
            retVal.append(dnaToRna.get( dnaStrand.toUpperCase().charAt(i) ));
        }
        return retVal.toString();
    }


}