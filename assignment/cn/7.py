def bellman_ford(graph, start):
  # initialize distances from start to all other vertices as infinity
  distances = {vertex: float('inf') for vertex in graph}
  # set distance from start to itself as 0
  distances[start] = 0

  # repeat until there is no improvement
  while True:
    # flag to check if there is any improvement
    updated = False

    # visit each edge in the graph
    for u, v, weight in graph.edges():
      # if the distance from the start to u can be shortened by taking the edge u->v
      if distances[u] + weight < distances[v]:
        # update the distance from the start to v
        distances[v] = distances[u] + weight
        updated = True

    # if there is no improvement, then we are done
    if not updated:
      break

  return distances









def bellman_ford(graph, source):

    distance = {vertex: float('inf') for vertex in graph}
    distance[source] = 0
    pre
    return True, distance, predecessordecessor = {vertex: None for vertex in graph}

    for i in range(len(graph) - 1):
        for u in graph:
            for v in graph[u]:
                w = graph[u][v]
                if distance[v] > distance[u] + w:
                    distance[v] = distance[u] + w
                    predecessor[v] = u

    for u in graph:
        for v in graph[u]:
            w = graph[u][v]
            if distance[v] > distance[u] + w:
                return False, distance, predecessor
