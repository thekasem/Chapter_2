/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.chapter4.Ip;
import com.mycompany.chapter4.Patient;
import com.mycompany.chapter4.YesNo;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kasem
 */
public class SumAvgRefectionPatientT {
    
   private int sum(Patient patient) throws Exception{
       Method[] method = patient.getClass().getMethods();

        return 0;
    }

    @Test
    public void sum1Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sum2Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(5, sum(ip));
    }
}
