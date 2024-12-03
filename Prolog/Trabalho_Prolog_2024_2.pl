% Fatos
gosta(jo�o, a��o).
gosta(jo�o, fic��o).
gosta(maria, romance).
gosta(maria, com�dia).
gosta(ana, fic��o).
gosta(ana, drama).
gosta(carlos, a��o).
gosta(carlos, com�dia).
gosta(beatriz, romance).
gosta(beatriz, fic��o).

filme(vingadores, a��o).
filme(deadpool, com�dia).
filme(titanic, romance).
filme(matrix, fic��o).
filme(interestelar, fic��o).
filme(o_diario_de_uma_paix�o, romance).
filme(john_wick, a��o).
filme(parasita, drama).
filme(guardioes_da_gal�xia, a��o).
filme(a_chegada, fic��o).

% Regras
regra1(Usuario, Filme) :- filme(Filme,Genero)
,gosta(Usuario,Genero).

regra2(Filme) :- filme(Filme,Genero)
,gosta(Usuario1,Genero)
,gosta(Usuario2,Genero)
,Usuario1 \= Usuario2
,Usuario1 @< Usuario2.

regra3(Filme, Usuario1, Usuario2) :- filme(Filme,Genero)
,gosta(Usuario1,Genero)
,gosta(Usuario2,Genero)
,Usuario1 \= Usuario2
,Usuario1 @< Usuario2.



