package lk.ijse.eca.enrollmentservice.mapper;

import javax.annotation.processing.Generated;
import lk.ijse.eca.enrollmentservice.dto.EnrollmentDto;
import lk.ijse.eca.enrollmentservice.dto.StudentDto;
import lk.ijse.eca.enrollmentservice.entity.Enrollment;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-22T21:33:20+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25-loom (Oracle Corporation)"
)
@Component
public class EnrollmentMapperImpl implements EnrollmentMapper {

    @Override
    public EnrollmentDto toDto(Enrollment enrollment, StudentDto student) {
        if ( enrollment == null && student == null ) {
            return null;
        }

        EnrollmentDto.EnrollmentDtoBuilder enrollmentDto = EnrollmentDto.builder();

        if ( enrollment != null ) {
            enrollmentDto.id( enrollment.getId() );
            enrollmentDto.date( enrollment.getDate() );
            enrollmentDto.studentId( enrollment.getStudentId() );
            enrollmentDto.programId( enrollment.getProgramId() );
        }
        enrollmentDto.student( student );

        return enrollmentDto.build();
    }

    @Override
    public Enrollment toEntity(EnrollmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Enrollment enrollment = new Enrollment();

        enrollment.setDate( dto.getDate() );
        enrollment.setStudentId( dto.getStudentId() );
        enrollment.setProgramId( dto.getProgramId() );

        return enrollment;
    }

    @Override
    public void updateEntity(EnrollmentDto dto, Enrollment enrollment) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getDate() != null ) {
            enrollment.setDate( dto.getDate() );
        }
        if ( dto.getStudentId() != null ) {
            enrollment.setStudentId( dto.getStudentId() );
        }
        if ( dto.getProgramId() != null ) {
            enrollment.setProgramId( dto.getProgramId() );
        }
    }
}
