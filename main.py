import time
import sys

from decompression import HuffmanDeCompressor
from compression import HuffmanCompressor

def main():
    value = input('(0) To Exit:\n(1) Compress File:\n(2) Decompress File:\n')

    startTime = time.time()

    if value == '1':
        encoder = HuffmanCompressor()
        name = input('Enter Name: ')
        encoder.compressFile(name)
    elif value == '2':
        decompressor = HuffmanDeCompressor()
        name = input('Enter Name: ')
        decompressor.decompressFile(name)
    elif value== '0':
        sys.exit("Program Terminated...")

    print("Time Elapsed: %s seconds" % (time.time() - startTime)+"\n")


while True:
    main()
