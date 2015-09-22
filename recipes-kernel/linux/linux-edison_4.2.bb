LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

COMPATIBLE_MACHINE = "(edison)"

LINUX_VERSION = "4.2"
LINUX_VERSION_EXTENSION = ".0"
S = "${WORKDIR}/linux-${LINUX_VERSION}"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${LINUX_VERSION}.tar.xz"
SRC_URI += "file://defconfig"
SRC_URI[md5sum] = "3d5ea06d767e2f35c999eeadafc76523"
SRC_URI[sha256sum] = "cf20e044f17588d2a42c8f2a450b0fd84dfdbd579b489d93e9ab7d0e8b45dbeb"
#SRC_URI[md5sum] = "fe9dc0f6729f36400ea81aa41d614c37"
#SRC_URI[sha256sum] = "caf51f085aac1e1cea4d00dbbf3093ead07b551fc07b31b2a989c05f8ea72d9f"
