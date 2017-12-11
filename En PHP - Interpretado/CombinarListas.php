<?php
$listUno = array("Negro", "Blanco", "Verde", "Cafe", "Gris");
$listDos = array("Grande", "Mediano", "Chico");

for($m = 0; $m < count($listUno); $m++) {
  for($n = 0; $n < count($listDos); $n++) {
    echo "{$listUno[$m]}-{$listDos[$n]}\n";
  }
}
?>
