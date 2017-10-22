# Mars Robot Project
[![Release Version](https://img.shields.io/github/release/diegosilva13/mars-robot.svg)](https://github.com/diegosilva13/mars-robot/tree/v1.0)
[![Build Status](https://travis-ci.org/diegosilva13/mars-robot.svg?branch=master)](https://travis-ci.org/diegosilva13/mars-robot)
[![codecov](https://codecov.io/gh/diegosilva13/mars-robot/branch/master/graph/badge.svg)](https://codecov.io/gh/diegosilva13/mars-robot)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/a909853e988e408abde3faef88049776)](https://www.codacy.com/app/diegosilva13/mars-robot?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=diegosilva13/mars-robot&amp;utm_campaign=Badge_Grade)

## Problema
Um time de robôs devem ser colocados pela NASA para explorar um terreno em Marte.
Esse terreno, que é retangular, precisa ser navegado pelos robôs de tal forma que suas câmeras acopladas possam obter uma visão completa da região, enviando essas imagens novamente para a Terra.

A posição de cada robô é representada pela combinação de coordenadas cartesianas (x, y) e por uma letra, que pode representar uma das quatro orientações: `NORTH`, `SOUTH`, `EAST` e `WEST`. Para simplificar a navegação, a região “marciana” a ser explorada foi subdividia em sub-regiões retangulares.
Uma posição válida de um robô, seria `(0, 0, N)`, que significa que o robô está posicionado no canto esquerdo inferior do terreno, voltado para o Norte.
Para controlar cada robô, a NASA envia uma string simples, que pode conter as letras `L`, `R` e `M`. As letras `L` e `R` fazem o robô rotacionar em seu próprio eixo 90 graus para esquerda ou para direita, respectivamente, sem se mover da sua posição atual. A letra `M` faz o robô deslocar-se uma posição para frente.
Assuma que um robô se movimenta para o NORTE em relação ao eixo y. Ou seja, um passo para o NORTE da posição `(x,y)`, é a posição `(x, y+1)`
Exemplo: Se o robô está na posição `(0,0,N)`, o comando `MML` fará ele chegar na posição `(0,2,W)`.

## Aplicação
