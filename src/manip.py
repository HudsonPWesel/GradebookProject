import csv

a, b = open("students.csv").read(), open("courses.csv").read()

# print(a.split('\n')[1:])
# ID, field_of_study,current_class = []

print([[line1 + line2] for line1,
       line2 in zip(a.split('\n'), b.split('\n')[1:])])
# print((a.split('\n')[1]).split(',')[:2])
# print(([b.split('\n')[1]][0]).split(','))
# print([line1 + line2 for line1,
#    line2 in zip((a.split('\n')[1]).split(',')[:2], ([b.split('\n')[1]][0]).split(','))])
# print([line1 + line2 + line3 for line1,line2,line3 in zip(a.split('\n')[1:],b.split('\n')[1:])])
