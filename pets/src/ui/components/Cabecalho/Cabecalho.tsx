import { CabecalhoContainer,
         Logo
} from "./Cabecalho.style";
import { Link } from '@mui/material';
import NextLink from 'next/link';

export default function Cabecalho(){
    return (
    <CabecalhoContainer>
        <Link component={NextLink} href={'/pets/cadastro'} >
            <Logo src="/imagens/logo.svg" alt= "Adote um Pet"/>
        </Link>
    </CabecalhoContainer>
    )
}