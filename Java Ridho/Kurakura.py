import turtle as kura2
import colorsys as warna

kura2.bgcolor("black")
kura2.tracer (5)
kura2.pensize (2)
kura2.goto (0, -100)

h = 0

for i in range (300):
    warna1 = warna.hsv_to_rgb(h,1,2)
    h  