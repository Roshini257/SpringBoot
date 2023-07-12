package com.example.demo;

import com.example.demo.repositories.SubmissionRepoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.function.BooleanSupplier;

public class SubmissionRepoTest {
    static SubmissionRepoClass Repo;
    @BeforeAll
    public static void init(){
        Repo= new SubmissionRepoClass();
    }
    @Test
    public void test_addSubmission() throws Exception{
        Submissions sub1= getSubmission("25-1-2023","Akash","java","Avi","Roshini");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,Submissions> hm = (HashMap<String, Submissions>) privateField.get(Repo);
        int size=hm.size();

        Submissions result = Repo.addSubmission(sub1);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Akash",result.getSalesPersonName());
        Assertions.assertEquals("Avi",result.getVendorName());
        Assertions.assertEquals(size+1,hm.size());
    }
    @Test
    public void test_updateSubmission() throws NoSuchFieldException, IllegalAccessException {
        Submissions sub1= getSubmission("25-1-2023","Akash","java","Avi","Roshini");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,Submissions> hm = (HashMap<String, Submissions>) privateField.get(Repo);
        hm.put("id-1",sub1);
        Submissions sub2= getSubmission("25-1-2023","Akash","java","Harish","Roshini");
        sub2.setId("id-1");
        Submissions result = Repo.updateSubmission(sub2);


        Assertions.assertEquals("Harish",hm.get("id-1").getVendorName());

        Assertions.assertNotNull(result);

    }

    @Test
    public void test_delSubmission() throws Exception{
        Submissions sub1= getSubmission("25-1-2023","Akash","java","Avi","Roshini");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,Submissions> hm = (HashMap<String, Submissions>) privateField.get(Repo);
        hm.put("id-1",sub1);

        boolean result= Repo.deleteSubmission("Roshini");

        Assertions.assertTrue(result);
        Assertions.assertEquals(0,hm.size());

    }
    @Test
    public void test_getSubmission() throws Exception{
        Submissions sub1= getSubmission("25-1-2023","Akash","java","Avi","Roshini");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,Submissions> hm = (HashMap<String, Submissions>) privateField.get(Repo);
        hm.put("id-1",sub1);

        Submissions result=Repo.getSubmission("id-1");
        Assertions.assertEquals("Akash",result.getSalesPersonName());

    }


    public static Submissions getSubmission(String date,String salesPersonName,String technology, String vendorName,String consultantName){
        Submissions dto = new Submissions();
        dto.setSubmissionDate(date);
        dto.setSalesPersonName(salesPersonName);
        dto.setTechnology(technology);
        dto.setVendorName(vendorName);
        dto.setConsultantName(consultantName);
        return dto;
    }


}




