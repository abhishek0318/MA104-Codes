ball1 = (3, 4, 4)
ball2 = (0, 0, 1)

def does_collide(ball1, ball2):
    distance_btw_balls = ((ball1[0] - ball2[0]) ** 2 + (ball1[1] - ball2[1]) ** 2) ** (1 / 2)
    return distance_btw_balls <= ball1[2] + ball2[2]

print(does_collide(ball1, ball2))
