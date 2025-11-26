import random

random.seed(0)

map_list = [[0 for _ in range(50)] for _ in range(20)]

def noise():
    global map_list
    map_list[0][0] = random.randint(0,1)
    for i in range(49):
        map_list[0][1+i] = 



noise()
draw = '.#'
for i in range(20):
    text = ''
    for j in range(50):
        text += draw[ map_list[i][j] ]
    print(text)
