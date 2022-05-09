
COPY = """

%s

%d elephants swing happily
On a spider web this morning
The web is strong, it doesn't break
So he calls another elephant
"""
a = """
An elephant swings happily 
On a spider web this morning
The web is strong, it doesn't break
So he calls another elephant"""
count_elephant = 1
while count_elephant < 6:
    if count_elephant == 1:
        print(a)
    elif count_elephant == 2:
        print(COPY % ('Two', count_elephant))
    elif count_elephant ==3:
        print(COPY % ('Three', count_elephant))
    elif count_elephant ==4:
        print(COPY % ('Four', count_elephant))
    elif count_elephant ==5:
        print(COPY % ('Five', count_elephant))
    count_elephant += 1
