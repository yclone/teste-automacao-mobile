#language:pt
#Author: Vinicius Marra Santos
@AcessoAplicaticoCalculadora
Funcionalidade: abre a calculadora do celular e faz operações matematicas

  @calculadoraSoma
 	Cenario: fazer soma
    Dado que eu abra a calculadora no celular "Android SDK built for x86", "emulator-5554", "8.0.0"
    Quando fazer a soma de 3 mais 7
    E clicar em igual
    Entao a resposta deve ser "10"
	