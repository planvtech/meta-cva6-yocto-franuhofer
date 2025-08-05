require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "git://source.denx.de/u-boot/u-boot.git;protocol=https;branch=master; \
           file://devtool-fragment.cfg \
           file://0001-cva6-Add-Genesys-2-support.patch \
          "

SRCREV = "34820924edbc4ec7803eb89d9852f4b870fa760a"

DEPENDS += "bc-native dtc-native gnutls-native python3-pyelftools-native u-boot-tools-native"

