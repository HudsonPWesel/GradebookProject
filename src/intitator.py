
import csv


def append_courses_to_student(classes,student_index):
    print(classes)
    with open('students.csv') as file:
        print(segment_students(file,student_index))
        
    return

def segment_students(file,student_index):
    student_ref_lines = csv.reader(file)
    next(student_ref_lines, None)
    return {"key": student[1] for student in enumerate(student_ref_lines) if student[0] + 1 == student_index}['key']

def segment_courses():
    courses = process_course_rows()
    enrolled_classes = []

    indexer = 0
    student_index = 0

    max_num_classes = 5

    for index in range(indexer, max_num_classes):
        enrolled_classes.append({**courses[index]})
        if (index + 1 == max_num_classes):
            student_index += 1
            index += 1
            max_num_classes += 5
    return [enrolled_classes,student_index]



def main():
    classes,student_index = segment_courses()
    
    append_courses_to_student(classes,student_index)
    # TODO: GET THE VALS IN COURSES APPEND THEM TO STUDENS.csv


def process_student_rows(file):
    pass


def process_course_rows():
    with open("courses.csv") as courses_file:
        rows = []
        reader = csv.DictReader(courses_file)
        for row in reader:
            try:
                int(row["ID"])
            except:
                continue
            rows.append(row)

    return rows


if __name__ == '__main__':
    main()
