import csv

a,b = open("students.csv").read(), open("courses.csv").read()

# print(a.split('\n')[1:])
# ID, field_of_study,current_class = []

print((a.split('\n')[1]).split(','))
print(([b.split('\n')[1]][0]).split(','))
# print([line1 + line2 + line3 for line1,line2,line3 in zip(a.split('\n')[1:],b.split('\n')[1:])])