
import csv


def append_courses_to_student(enrolled_classes, student_index):
    with open('students.csv') as file:
        student_ref_lines = csv.reader(file)
        next(student_ref_lines, None)
        # current_student = {"key": [
        # {"yog": student[0], "name": student[1]}]for student in enumerate(student_ref_lines)}['key'][0]
        current_student = {"key": student[1]
                           for student in enumerate(student_ref_lines) if student[0] + 1 == student_index}['key']

        with open('students.csv', "w") as file_write:
            pass


def segment_courses():
    # rows = []
    # rows = process_course_rows(courses_file)
    courses = process_course_rows()
    enrolled_classes = []

    indexer = 0
    max_num_classes = 5
    student_index = 0

    for index in range(indexer, max_num_classes):
        enrolled_classes.append({**courses[index]})

        if (index + 1 == max_num_classes):
            student_index += 1

            print(append_courses_to_student(enrolled_classes, student_index))

            index += 1
            max_num_classes += 5

    return enrolled_classes

    # with open("students", "w") as students_file:
    #     for row in rows:
    #         students_file.write


def main():
    # with open("courses.csv") as file:
    #     rows = process_course_rows(file)
    #     for row in rows:
    #         print(row)
    segment_courses()
    # with open("courses.csv", "r") as courses_file:
    # pass
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
