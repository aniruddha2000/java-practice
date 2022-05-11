import socket as sct
import threading


class Server:
    
    def __init__(self, host, port) -> None:
        self.HOST = host
        self.PORT = port
        self.SOCKET = sct.socket(sct.AF_INET, sct.SOCK_STREAM)

    def run_server(self):
        try:
            self.SOCKET.bind((self.HOST, self.PORT))
        except Exception as e:
            print("Failed to bind socket - ", e)

        print("Socket binding is complete")
        self.SOCKET.listen(10)
        while True:
            connection, address = self.SOCKET.accept()
            connection.settimeout(60)
            print('Listenning to ' + address[0] + ':' + str(address[1]))
            threading.Thread(target = self.concurency,args = (connection,address)).start()

    def concurency(self, client, adddress):
        size = 1024
        while True:
            try:
                data = client.recv(size)
                # if data:
                response = b"200 OK"
                client.send(response)
                client.close()
                # else:
                #     raise Exception('Client disconnected')
            except:
                client.close()
                return False
        

server = Server('localhost', 8000)
server.run_server()
