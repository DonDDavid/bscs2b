package Abstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtendingStudentRecord ext1 = new Anna();
        ExtendingStudentRecord ext2 = new Beah();
        ExtendingStudentRecord ext3 = new Cris();

   //     ext1.Email();
   //     ext2.Email();
  //      ext3.Email();

   //     ext1.OopGrades();
 //       ext2.OopGrades();
 //       ext3.OopGrades();

        List<ExtendingStudentRecord> extendingStudentRecords = new ArrayList<>();

        extendingStudentRecords.add(ext1);
        extendingStudentRecords.add(ext2);
        extendingStudentRecords.add(ext3);

        for(ExtendingStudentRecord ext : extendingStudentRecords) {
            if (ext instanceof Anna) {
                ext.Email();
                ext.OopGrades();
            }
            if (ext instanceof Beah) {
                ext.Email();
                ext.OopGrades();
            }
            if (ext instanceof Cris) {
                ext.Email();
                ext.OopGrades();
            }
        }

    }
}
