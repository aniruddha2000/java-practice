from http import client
import socket
from time import sleep

class Client:

    def __init__(self) -> None:
        self.ClientMultiSocket = socket.socket()
        self.host = '127.0.0.1'
        self.port = 8000
        try:
            self.ClientMultiSocket.connect((self.host, self.port))
        except Exception as e:
            print(str(e))


    def run_client(self):
        print('Waiting for connection response')
        while True:
            Input = "Hello"
            self.ClientMultiSocket.send(str.encode(Input))
            res = self.ClientMultiSocket.recv(1024)
            print(res.decode('utf-8'))
            self.ClientMultiSocket.close()
            sleep(4)

client = Client()
client.run_client()