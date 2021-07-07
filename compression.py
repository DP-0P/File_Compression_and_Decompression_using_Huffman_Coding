from PIL import Image

print("hello")
# file = open(r"test.png","r")
# file.read(9)
# print(file)
im = Image.open("test.png")
print(im)
# im.show()