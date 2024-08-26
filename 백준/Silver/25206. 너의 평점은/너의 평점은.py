
score = []
grade = []
cnt = 0
for _ in range(20):
    s, n, m = input().split()
    if m == "A+":
        m = 4.5
    elif m == "A0":
        m = 4.0
    elif m == "B+":
        m = 3.5
    elif m == "B0":
        m = 3.0
    elif m == "C+":
        m = 2.5
    elif m == "C0":
        m = 2.0
    elif m == "D+":
        m = 1.5
    elif m == "D0":
        m = 1.0
    elif m == "F":
        m = 0.0
    score.append(n)
    grade.append(m)
    cnt += 1

total = 0
scores = 0
for i in range(20):
    if grade[i] != "P":
        total += float(score[i]) * float(grade[i])
        scores += float(score[i])
    else:
        cnt -=1

print(round(total / scores ,6))
