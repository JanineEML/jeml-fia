# Verzweigungen
[int]$zahl = Read-Host "Bitte geben die eine Zahl ein: "

if ($zahl -gt 0) {
    Write-Host "die Zahl ist nicht negativ"
}

if ($zahl -gt 25) {
    Write-Host "die Zahl ist größer 15"
}

if ($zahl -gt 25) {
    Write-Host "die Zahl ist größer 25"
}

else {
    "Die Zahl ist negativ"
}