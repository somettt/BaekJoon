import sys
import heapq

N = int(sys.stdin.readline()) #최대값 지정
if not 1<=N<=100000:
    sys.exit()

small = []
big = []

for i in range (N):
    a = int(sys.stdin.readline())
    
    if len(small) == len(big):
        heapq.heappush(small,-a)
    else:
        heapq.heappush(big,a)

    if big and -small[0] > big[0]:
        x = -heapq.heappop(small) # 작은 큐의 최대(-붙여서 복원) 
        y = heapq.heappop(big) # 큰 큐의 최소 
        heapq.heappush(big,x) #트레이드
        heapq.heappush(small,-y) # 작은 큐의 최대힙 유지를 위해 음수로

    print(-small[0])
