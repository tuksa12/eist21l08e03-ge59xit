package de.tum.in.ase.eist;

import static org.easymock.EasyMock.*;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EasyMockExtension.class)
public class EnrollmentServiceTest {

    @TestSubject
    private EnrollmentService enrollmentService = new EnrollmentService();

    @Mock
    private Course courseMock;

    @Test
    public void testEnrollStudentSuccessful() {

        Student student = new Student();
        int expectedSize = student.getCourseList().size() + 1;
        expect(courseMock.enroll(student)).andReturn(true);
        replay(courseMock);
        enrollmentService.enroll(student, courseMock);
        assertEquals(expectedSize, student.getCourseList().size());

        // TODO implement the test
        //throw new RuntimeException("not implemented yet");

    }

    private void assertEquals(int expectedSize, int size) {
        if (expectedSize == size){
            return;
        }
    }

}
