package tianci.dev.xptranslatetext;

import android.util.Base64;

/**
 * These API keys are collected from GitHub. Please use them with gratitude and care. Love :)
 * Use simple encryption to prevent easy detection by search engines; no special meaning.
 */
public class KeyObfuscator {
    private static final String[] OBFUSCATED_KEYS = {
            "QUl6YVN5RGdmT3l4RkwzWEZ6Q0dQcEpNNXNtcWRjM3ctQVFRcHR3",
            "QUl6YVN5Q0ltb1hZWUd3ZlVwWVc4NFpLU0RPQ2pUSlZpUDZSeFFv",
            "QUl6YVN5RHNPYThHLWVxRkJpZVFUYWcxdS03ZWtuQ011X291dlZF",
            "QUl6YVN5RDV4UTVtUFpZcWhWZVJRS3BuMWpvVV9pNGRIQzRmcmFz",
            "QUl6YVN5QTJFc3F0dGRQa1FRZmJReF9uMXBabC1iODN5ZUcxMUZj",
            "QUl6YVN5RDNJOC1lUlh4ZVpwMGE0NEQzTHgyaXRlTzVvY0FhNTFr",
            "QUl6YVN5QlJKT1BvZDB2WVl2cHJpSkVzMlZoLTdza21BeVE4Ni1z",
            "QUl6YVN5QU91alZRMlNKdnZnd2pJS09vY0xWUUpSdV9OMHA3WW5Z",
            "QUl6YVN5QVNHQ3d0YnV6UG9iRW9zQkhUZUNuX29ROFh2OEtkNTJz",
            "QUl6YVN5REpnXzZGZENxQUdTY0dXUTNsUXNXMXJiVk9Ka0dPZW9V",
            "QUl6YVN5RG5ZU3gyS3JBMWxmZ1VQQWY4UGZZOGRzSFc4QmdhNHVN",
            "QUl6YVN5RC1mR2F2UDdJSjM1bzNNTXVfS0RqMkoxZHBMRzVqcGw4",
            "QUl6YVN5RC1LUnJ4UFV6eC1YWG1HYmdhV2g3MVVBakdLR0tKZnNN",
            "QUl6YVN5Q3lMeWlnbjdIQzJaYVJjVGFrMGVTM0ExaXMxM2d0QWJN",
            "QUl6YVN5REk4ZUpHNEhxRjYwYTZzbnZTUllGb1hucy02UVBRTjM4",
            "QUl6YVN5QXd1V0JOeFR6cW9nX2xrSHo0WC1zUk1EYkZIT3ZRWkJZ",
            "QUl6YVN5QkR3bmdjU29YX1NaYUhoU3pfc1FtVnc3YTY2ZjZrcm40",
            "QUl6YVN5REd5UGRDY2NiLTJ4YjEweXBrY1JlTXB1YV8xSl8tWmE0",
            "QUl6YVN5QzFwOHp0NlpGWUs4REQ3RlB6S2FLUkxMZk1fbHM3SWUw",
            "QUl6YVN5RERtWV9iXzZQUkFDdlFSaTUzd1J0NEdjMlE0Z2pDdGxF",
            "QUl6YVN5Q2ZEYXNxTlg3TW9KZFNQRDBKbG91QnZUVlAyWmJ1QUpz",
            "QUl6YVN5QXRncjA0U3U5ZEpWelVHaUJhdjlSU2RWM2NGWm16czBj",
            "QUl6YVN5QWpuaGZlSVo4ZTRfNzdXMXlOM3BmQThwUGdGZU11amhR",
            "QUl6YVN5QVlmY1RBRmJhNW1uNUxYdzRVTk5mbkJ2UUVnbU5iQW9z",
            "QUl6YVN5QzUwQU01cnY0SklydVlhWlFyZUJXQUhldDV0eXVWODRv",
            "QUl6YVN5RDVIdm95ak9RTUlCTkpSckZLM080c3hEYXAtLUJWVV9R",
            "QUl6YVN5RDNlclA5emlISWZCXzF6WlhlM0xGYmR6VlZEZ2lxSE93",
            "QUl6YVN5Q3pOR21jRERCTzFCMThmeEtoNHlhdUpYMmpVRTdZd2E4",
            "QUl6YVN5Q1VId0g2TEhiNERqT2s0VFE3SzIxdnhNa2VkbUxaT2dF",
            "QUl6YVN5Q1lDa2ltM3BvWnNCN3BvMmdnQXlKUkZjTVg2SUJab0Yw",
            "QUl6YVN5Q3RBOUJ4dUZ2S3ZxZ25FZVQzOGdqdFVINk1zR2FqQ0tJ",
            "QUl6YVN5Q2ZidTlib3h0cVBjaDlwUjhHSHVrdHk4ejJiUFNYb3BV",
            "QUl6YVN5Q1A3WGpLZ3hLdXBOU24yaWx1d212dFc4cTRPVFE4R3N3",
            "QUl6YVN5QVU5ZHVDU3ZhMmYzWGZkSktDRXI4MFZlRTNaanh2VzZn",
            "QUl6YVN5RG9BY2JXcERxa01mbVktNzlDTnpKQnhaVVF6Z1AzcFEw",
            "QUl6YVN5Qnk4VXlvX1ZTV1RPdTJzZFE0cmhGRHZBeE5CaXpGUG5N",
            "QUl6YVN5RHc1TG14MzhENEs5UlAtRzNLbXVMV1ptYllZNEJUQmxj",
            "QUl6YVN5QWtMOHBaZDVNTUc1cGFwbXcwTlc3bDJ5elpKVTB2dUJ3",
            "QUl6YVN5Ql9vaTZNWDN3c0pVbTFYQjk0TmRhWXhkVndxeE53X3Vv",
            "QUl6YVN5QklVcWVGN2Vpc09GSEU3NXdMWF9GZ2t2OFM5R3BGWm5B",
            "QUl6YVN5Q3NLNGFiaFZNZko5OEE2V2dPTTZtdmw2YnRMemVEUTlV",
            "QUl6YVN5Q1R5M281WHVzZUV1SmJLNUgyRWR3RVJtTVVINkV4T0VB",
            "QUl6YVN5Q2VDeGNDSXloVHhVeXhYd1NDRkN1aEFXUnpTT3E5T1lr",
            "QUl6YVN5QkItWklKNWo3THotRHBjVHBONlJ3WndtTjFPX0tBaUlJ",
            "QUl6YVN5RGpMdy1aYVJJV3ZaZEljaU9Ka2xMbWQwOUpLd09rQm9N",
            "QUl6YVN5Q2tmSWduN0t4QkkweDRBOTdLdEtjYWJzWWplZXRaSWpN",
            "QUl6YVN5RF9wNGI2UERTT2ZKNTkyeWQ2dWhyLXdEbTZDVWx6am9Z",
            "QUl6YVN5QzY0enczQ0RGUHVLMUlKc3lCX1B5R0EzNTVYbm1UMnp3",
            "QUl6YVN5Q25LYVowX3NrNnVQMVRFVFdvR0pYTENWaGlOMlZxdmcw",
            "QUl6YVN5QVFHVnY0bTZ2SmFfaXFfM3N2aDlwMXZmR1EtdkxNSlVz",
            "QUl6YVN5QTIzb0hYeXBjUXBWNlV1ekdvRXdxcnJkYk51WnVoS1NJ",
            "QUl6YVN5QnVocU90Uk5acTI5NTRRaktNc0k2NnZiYndDTklqc2ZV",
            "QUl6YVN5QXN6cTkwUzlFbXpzLTVwZUFsTllBaS1uT0JVRnRYVFNr",
            "QUl6YVN5QlV6NFh3LWM5MlJ0ajBJUm1wT3hMMnM1dy1sUC0zYnc0",
            "QUl6YVN5RDZfNWRNMnplN2YtX21ubG0yNnhlQzNMSkNNTkZXY0ln",
            "QUl6YVN5Q2cyQ2l4dGJOUTJWanZ4Z055UUh0Y3NUenNzczRBOWxR",
            "QUl6YVN5Qk5jM29WQ0Y0eXpyWDVTdmU1b2pFblFtMjFiTmx1VGZZ",
            "QUl6YVN5RDk1NW93MXNmRlJQRXBzMHAxcUtNUmh2eW9FWEJLc1pZ",
            "QUl6YVN5RHhnbHZ0VnZfQTd5ZWZxWERvUldUVjZSZFh3RmJ5eEJN",
            "QUl6YVN5QUJVaTdhalNSZi1pN0NzRFRjRm9jelcwdWpxdEI0RWhR",
            "QUl6YVN5RE1jUlk0Zkt0MHd4elJpM2NUb2hLeTA5aU5xSUY5a1I0",
            "QUl6YVN5QUd4aExOc1hjbnVINTRUT3c5NUpUSGhVMXlaOGstSDg0",
            "QUl6YVN5QWdkRGRRLUlVeER2cmJaTTk2ZHRaLXAyNmVtSU9mOU13",
            "QUl6YVN5Q2V6VlN6cVZ6OGNyaThKZnp2dWY0RUVIcUhVV2lfdHpz",
            "QUl6YVN5Q0VMbXEzY3RvZl9Rd3cwSnY0dWtnbjl3UmNaVUJoTG5J",
            "QUl6YVN5Q2FHZjBJMzd6cDhkdjhhc0hKdmozdUIwTUVjTUhFUGNJ",
            "QUl6YVN5Q01sRW00eE02aEQ4MThKYmwyMUJ1ZzVwdWh3ZTBhcHZ3",
            "QUl6YVN5Q0ZiTDRfWElGd1lOaVVHVURER2Jza1VlZ0haem1tTkZV",
            "QUl6YVN5QTZVRDhId2hIZzM3bjNZenNydDEzYXh0czNabTRfZmNV",
            "QUl6YVN5QWViVWVic1AxTVQ1YnJvMnFTZk8tRGJBNkNDQ21XbW5n",
            "QUl6YVN5QjZZcXhBdlpuWm5MTUdibWhOdUd0dTRaaGNZa0xMUEpj",
            "QUl6YVN5RC1JS2RXUW54Z0F4VXloaVRtdTR6LU5fY2Z0UnR5TTMw",
            "QUl6YVN5QTlnbWhUZGlNdFQ0cm9zSGx0em5aR0pXRmEwNHFJd1RJ",
            "QUl6YVN5QU5scXNlTGtUMGlTNXp1dEdPZnFRSVJPdzlIMFdBeEtF",
            "QUl6YVN5RGg3TFlydlBpcVVmMzBOS1ZHTjR2MUhScUJSYmZPcFJR",
            "QUl6YVN5RFBoTy1rUDl0YnQ2Wm5ZOU51TVU5M01zMHR6dGE2SmUw",
            "QUl6YVN5Q0p0eW1YeHdobzlHOXdvbVhRRDEySERaSk5CYlpqVnFV",
            "QUl6YVN5Q05fMGFzWjc4eXA0dDhGelk5T1JraXdmRUZ2aTBIRm5R",
            "QUl6YVN5QVBMcGZRbmlITENuUjFVRUZPVWhJcU1KS0E0VzlCdlJz",
            "QUl6YVN5Qk50RDNIMnVOdEJJcC00YWFQNzcyb2ZIVWpZQnNSaG5n",
            "QUl6YVN5Q2pKSi1YU1JhRmFQR1hZRnV1ZmVmTmVpRTc0dEt4bGhJ",
            "QUl6YVN5QzB0T283NHBva29PM0RZTWp3Y3lOWG1nOVB3eF9aTE40",
            "QUl6YVN5QlEyVnZCbFJra3RaUlZkeWJrNjBYZ0dEVEtyRi10SkE4",
            "QUl6YVN5RFJ1VUxzd09DMWlGU0pyODNWcVJhZVAxZzhwMFZuNExj",
            "QUl6YVN5QldiWDNnZklCSlZPTUZ2bzBSMTZUTlNKeFd4aTRKS0dN",
            "QUl6YVN5RFRHMVFpNFNoc3AwSDJWRkcwRzVlbU5QRmlOVnhCY1lJ",
            "QUl6YVN5QlhnN3lCcnNxZWJuYk5neV9OU0xZb19adjBUUU95Z2o4",
            "QUl6YVN5Q2lGSnVRQ2Vlak81dTJhbjV2YzNUQmZtcFdxWGFIVXBN",
            "QUl6YVN5QnBGRElfbElIQ0FWYkZ4RXpmVk1hbkdZYkRObEdRU2JN",
            "QUl6YVN5QmJyRzkxVnZCbWxVYl9DSTdkaWF0QXlwOW83VjdtdDU4",
            "QUl6YVN5RFlUdDFKeEFScW8xT1AzaTZWajFWQjY0dWxVX0ZScS1F",
            "QUl6YVN5QVdtNnE1cFNvMVE3dE91MlhENVFKUEZGMV9xVXU2U2dV",
            "QUl6YVN5QnRhdGtTNkNucjZoOWIzdFFUczhZOFFBbUc1aU5BbnJJ",
            "QUl6YVN5RERuU1dkeEU1bGhVS3NiemlDUkR5T1JVMHJQSk55ZXZv",
            "QUl6YVN5QlRaVTJqXzNlYm1OTFMycnlLdWdDLXQ5NnlDOVh0RFVn",
            "QUl6YVN5QzlINktxVXQ5dk93ZHpHbEVwUlp1bWZrMDFkQkV3enc0",
            "QUl6YVN5Q2s2bG55QjgtN053MVFTT0REYVNLTVZwZTVfdUVpVmNJ",
            "QUl6YVN5RFB6YmsxSWRIMXFIRzhJbmQzcUU4d0d3VFk5OW5VYTNV",
            "QUl6YVN5Q1hTOGNxeV9zSlNSUmpBaDVyVzlRMXNUb3FpZ0tfNU53",
            "QUl6YVN5QWlpSzVlM0ljelJEZmJiLXd6NTlfbTJ4MFhRMTJWbm5v",
            "QUl6YVN5RGdtbUFrTXNWU0wxUWQ1dTl4RkFDbVZLeHE0YVVWY1JZ",
            "QUl6YVN5Q0w5cVR1VWd6YVlON2haWFd2cmJSc2p4RG9vZ1BUd3JR",
            "QUl6YVN5QkhqQ2xHSWFyUndwUEgwNmltREo0M2VTR1UyclRJQzZF",
            "QUl6YVN5REY1UzB1ZEFneVRaRklZbzFuOVMtcmpfYTVVM2Y0cDZR",
            "QUl6YVN5QVA3Vk95REZZdDk3ZVZFNVJNS0xJSnJscXpsOUdYcFhv",
            "QUl6YVN5RFIyTXVNV0xCelJQaURQZzdPOHNadWtlNzdDV216STFV",
            "QUl6YVN5QzVWTXB2LTRVZmZRUmtWSTFFN252ekR6cmhqN0pLaUZj",
            "QUl6YVN5QW44dFJaQXZJSnM0QXRlYkwtbXB5RzU5TWRXWTh3ZFRJ",
            "QUl6YVN5QUtURVJ0bk96bFIxOTBpSVR0ZFQyM2dOOS12R1I5ZFJV",
            "QUl6YVN5REM1cTlVYUxSZl96UzdnY05lc1o0dXFDbm1qWlBkbHdJ",
            "QUl6YVN5RDlwVmNCdDlXRHJ5ZWhIVTlBdG5BRmpYakpjMkhDM3lR",
            "QUl6YVN5QTl3ckVERDY1cDBvdGd1RmVFOGNBWXVKOWxtV09wZm9F",
            "QUl6YVN5RE5zU2VpMXc2UTRPYTZpU3oyWldza0RjWGtmOUd2RXJJ",
            "QUl6YVN5Qm5SNW5WSU9aYjEzWUEzYlR6RC16U3ROdEpzQnBDSkhB",
            "QUl6YVN5Q3p4RGR3THFfQVROUk5OSnZibU9rVVRJOGxGRmxnZThB",
            "QUl6YVN5Q1hrdXdHRFFaNFJLbEgtQXU0TzFWSkx2X1lodV9meEFN",
            "QUl6YVN5Q28xaEhST0J1WUlfOG10WGRUQkx1ay1iWENCZjdpRU1n",
            "QUl6YVN5RHVLVEJxVTdTXzFFakF0RDRfTDRwWEh0dEhSY01QanNj",
            "QUl6YVN5Q0V5OHBsVC1QSXlQdFNwWU9ueE1WdExXZ1FudlJNVWdv",
            "QUl6YVN5RHNFQmlVVHR2SUlsQ2J2UmlpTnJudk5fSXhlTnlYVURB",
            "QUl6YVN5Q1pnME83TWM5OEdlUy14blRiMnBpakxnYVVETFdJaWRr",
            "QUl6YVN5QjloVG5PbXBHWUVvNVNNbFlzbGdJWTNWYmx5cW4wdjJF",
            "QUl6YVN5Qk5NRzJQVnhBaHJwVGRSUUFEMnF6bzhBRnlySVJWUHVj",
            "QUl6YVN5QUl3b2x4eHJPRzU1Uzg3bS10Nk9vS0Y0TS1pV3NNbE5n",
            "QUl6YVN5QXNINmZZLXZvTFQxV1A0UGdaTDBiMm5BM2dacW96NldR",
            "QUl6YVN5QXB3aUxnZTZ2OEdxcGx2bTZuZHhBWGZGdFRUbUdvbWNN",
            "QUl6YVN5QjI0N2k4cjVvWDEyMEZyWVltaE1MMTVaanZHaU14QlJN",
            "QUl6YVN5QjR0dllZTkd0b3l3SmZMYUtwTk9VczFWcG9LMUJmRkdB",
            "QUl6YVN5Q2dDUW52WmNHem1xT1VmTEROajMzRTBZaTJ4S3cxeXI4",
            "QUl6YVN5QVJXem9fVVlhVnhUTTZ3MmgtU3ExdUJUX05uY1g3cEdv",
            "QUl6YVN5RG5jRGNtbjVqTFJ6V0QwcUdmWDUxUldYM3k1cU0zVWVr",
            "QUl6YVN5QUFIMjdjYXZUMXJ1RWJlRldEcE5YTWZxYXp5NDFtNEYw",
            "QUl6YVN5QkpYQXdMTDg0NzhRd3RSazRDMWJMRGo4YThHLURSNHMw",
            "QUl6YVN5RDhMS1ZEWE81ekFGWWJJTmNLSElJLWZpRGE2ckRleFI0",
            "QUl6YVN5QXpVRlQ3VjFqN0JGWmNDTnhrbEZkZXZrbzZmV1Jka0Rv",
            "QUl6YVN5Q1BGa0FpcU9ocWRjWUdzUmJkdGl2UDdvSlRaLXFMU3FN",
            "QUl6YVN5Q055ZHJKeTk2dGlUZEJWUVljR1VxM2EzUEpNNmJkMDFn",
            "QUl6YVN5QWYxdzZMaUxFVnhOU29rVFhVMGxGbXlfYWo3YWdPb3NN",
            "QUl6YVN5REhveHpFaWgwbFlBczg5cl9jMVBBWHRiX3FZTUdacnlB",
            "QUl6YVN5Qnl3emdxRF9QOUdvM3c4dDJjMllZZTZyczRobEtNSmtr",
            "QUl6YVN5Qy10M2szTHZqRzZNNTlBblhzQTVUeDE2WGJsbnI1YmY0",
            "QUl6YVN5REJqOFFVdVp4b2wzcy1hR0lhS3p2TjZDamR3NGxqaFp3",
            "QUl6YVN5RDFGcUtmSThhek1reWNxUHVJT2NldlQxUlc5SzlSY3NZ",
            "QUl6YVN5RGlvWEhmbTM0N3FkZTRUSEZyeWJ1Nlg4eXhrM1kzbklJ",
            "QUl6YVN5QkRjSUh3aTRUWDdNT01RX05uZDZBS3o4ajVLeGRHYTdv",
            "QUl6YVN5QV82SFZvTGVsLWpIV2FZNnZ2amtpZ1FwZmlNdXJ1LXdv",
            "QUl6YVN5QkNHcnI0TTF4a2JGalJ1TkZXM2xSMHk0TlNBeG5UeTFB",
            "QUl6YVN5Q3lCb0k0N1k0N1NsM2VHRmx0bC11bjZHNWRWYURfTmpR",
            "QUl6YVN5QVpBbTdSMVFKTlBGRlRmcWlWRC1VRG1Ydm9ldTB2enhF",
            "QUl6YVN5QktVaEVrSHJkUjdoN0NSb0xnOEtmZlRVakRuUnd2c1Zr",
            "QUl6YVN5RFZZN1J4cl9HcHdYaUc1UWlxSWdxN3RkS2ltR2JMRm9B",
            "QUl6YVN5QWV5MHYyQ082NTUyeXFTZnFwUTFBSm1od283UkRXcURB",
            "QUl6YVN5Q2ZwQlJuZ2Jsd2RzaGEtTkdwaGRDT0xrV1BQdDh3VXNB",
            "QUl6YVN5RFljZFJpTTdMQVVjZzJRbF8wMGJvQlpmZjJEZm1sZGdv",
            "QUl6YVN5RF94SV9UTkFYTGVJMklsb3F2Vm5mSWVEdTdtTmswQ2M4",
            "QUl6YVN5RElqblZFU3JqWUZsRS0zUG1NUjVtbE5nMVhBenkyemNr",
            "QUl6YVN5QUR0SXl5N0FCNkV6bDd3aVl0Q19qTHNncm9kMUN3UU1N",
            "QUl6YVN5QVJLX2xuZU5uWDVzdkNSUnBqcUc5cEhEM1ltUnZQOTBz",
            "QUl6YVN5Q25BZXBtZUpRSVdkYWJha2FWQnpaYVJMdm1JSUFqLWw0",
            "QUl6YVN5REg4YzV0NURWLUFjNTg3TjhTMGluN3pUbEo5ejhrVUhV",
            "QUl6YVN5RDFyZ1Z6OHZkSlJJenBZT3RyUjZ3V1FtazNNMU9JMmlF",
            "QUl6YVN5QkJONDBSd0lQelgxUl9sWWo2RFg2VHFWZUdOMXJIeWZr",
            "QUl6YVN5RFhHdlE3Tk9EajZDOTNCQWtIZVJsSWszYmg2MF9QTWtn",
            "QUl6YVN5QXF3OURVVUNFSGgyOE1sX1FXTEJHMkdMZnNZOVRwSU5J",
            "QUl6YVN5QjFBUUJSY1h3OWIzZFBBSmN2cE5adTNHRUJvbEdiaVpR",
            "QUl6YVN5QmV3RnpCaHM4cWU0a0xfc3FYN2JfNE8ySVNIM0sxNFlj",
            "QUl6YVN5RGhjM3lPYWduWFZEUFljeFJwaE1aQTFlWGpDUVMwb05z",
            "QUl6YVN5QjRhaEhoZU5Mb2FIZUdkbEpQc18tT2VUWU9JVzJfemVB",
            "QUl6YVN5QlVEVVVScWtONUx2aWQ1UDhWMFpYSVJwc2VLQzdmZk1V",
            "QUl6YVN5QmpvMXZmbk1GcnZkZU5NVzY4aHEyRnhqemdjNVM1Mjk4",
            "QUl6YVN5QUw2a0FCbi1WZjY2OWJQYkZBRWNYZi0zNVh2OXRHV0FB",
            "QUl6YVN5Q3dkRHZLcWMtVzlVY212ZTV0VTJPZW1uZU1QdnltVkVB",
            "QUl6YVN5QXYxeGdScVg1ZHZHTlhMLVVUS1p2Q1g0dDJ6VHlxeWc4",
            "QUl6YVN5QWJqTXNaRHQyUHlJbE5PTnhqcDZEVlctVFZLOTFkb0pF",
            "QUl6YVN5QnJOOC1ad2QzWml2U3pnN2NqejFncm5aaHhNQ2V1Wkxv",
            "QUl6YVN5QTd5QnJsZUluXy12UE9hZi1wMHRRR0RScUotcHNMbkFr",
            "QUl6YVN5QjZheXEtUGhEUnRUdVRTdlNKeDZRbktSaVhQOVpSa1lj",
            "QUl6YVN5RDRVemQyZjNWVGt0Wm5uWjZweUFMcE9lSExRMkFmZXRF",
            "QUl6YVN5Q0dPamZiQVVoTE5waDA3T3R1ZXU2RzBzcktnUmNjcTk4",
            "QUl6YVN5QkFlVGNOckFVT1c1Z3ZGMVVuOExUYnk3dk5Jd0ZmQkY0",
            "QUl6YVN5RGthNGZ0elZHWm5RU3F6b0JWZjNZY1hlWnpKT0gxUWFz",
            "QUl6YVN5RHYzQlVoc1NqQUJCVUNxRnFCZGhNT3FfUlJVaEpXOEZr",
            "QUl6YVN5REtfNjUtNU02NzdKakNoVi1PY2t2OXY4SE5wV0V4ajRv",
            "QUl6YVN5QmVrNm9Qd1lzQWppdndFQktONlJfTFhyQXoxaXZkdVVj",
            "QUl6YVN5QlZNUXYxMnY4Q2xUVGZrQlg3eGdoTXlBQUhSc2lvM19J",
            "QUl6YVN5Q1hUNUxBT3E5Qjg0dUFYQ2hFdjFyRjg2V2Y5NmM1M3M0",
            "QUl6YVN5RG9fal9VSkVIUnZwM3FqRHU0TzNIdUpodGlDcnEwTjV3",
            "QUl6YVN5RGZnOExwMmNZQ25wUTBvUTZpZG1VVGViallFdWRIdGhV",
            "QUl6YVN5QjZCTTNwWmZuX0NkWEtBbVJfaExCZFhBUFQzSmtWaG1Z",
            "QUl6YVN5Q3pMeE9LRFcxNlRmVC1fZjJfMjA2eXFTdzZqQ0Y2ajRr",
            "QUl6YVN5RG5BcnhpOVlrYkdHRTlVWWh4ekE4R3N2S0lYWldSSjlV",
            "QUl6YVN5QkxsNWdmNHJMME1JQzgzTk96cGJ1SEljVS16em55ZHpV",
            "QUl6YVN5Q3dWS1RtbjJTd3hsLWthNmZ1cDJuWGxNNmtMOFBUMHI0",
            "QUl6YVN5QVV4UkpCdGFRWkRrOWRzb3otemJzUFZ6alhsTGxVWnFn"
    };

    public static String[] getApiKeys() {
        String[] realKeys = new String[OBFUSCATED_KEYS.length];
        for (int i = 0; i < OBFUSCATED_KEYS.length; i++) {
            realKeys[i] = decodeBase64(OBFUSCATED_KEYS[i]);
        }
        return realKeys;
    }

    private static String decodeBase64(String base64) {
        byte[] decodedBytes = Base64.decode(base64, Base64.NO_WRAP);
        return new String(decodedBytes);
    }
}
