import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RnaTranscriptionTest {
    private  RnaTranscription rnaTranscription;
    @BeforeEach
    public void setUp() {
         rnaTranscription = new RnaTranscription();
    }
    @Test
    public void testTrueRna(){
        String rna="CGAU";
       assertEquals(rna,rnaTranscription.transcribe("GCTA"));
    }
    @Test
    public void testFalseRna(){
        assertEquals( rnaTranscription.transcribe("GCTA"),"CGAG");
    }
}