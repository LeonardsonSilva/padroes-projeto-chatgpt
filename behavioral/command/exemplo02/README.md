# Erro ao executar
Exception in thread "main" java.lang.UnsatisfiedLinkError: /opt/jdk-17.0.10/lib/libawt_xawt.so: libXtst.so.6: cannot open shared object file: No such file or directory

# Solução
sudo apt-get install libxext6 libxrender1 libxtst6 libxi6 --no-install-recommends -y
